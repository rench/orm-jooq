package com.lowang.ormjooq.web;

import static com.lowang.ormjooq.domain.tables.User.USER;

import java.util.List;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowang.ormjooq.domain.tables.pojos.User;
import com.lowang.ormjooq.domain.tables.records.UserRecord;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired private DSLContext context;
  final ModelMapper mapper = new ModelMapper();

  @ResponseBody
  @GetMapping("/{id}")
  public User get(@PathVariable(name = "id") Long id) {
    UserRecord record = this.context.selectFrom(USER).where(USER.ID.eq(id)).fetchOneInto(USER);
    if (record != null) {
      return mapper.map(record, User.class);
    } else {
      return null;
    }
  }

  @PostMapping
  public User save(User user) {
    UserRecord record = mapper.map(user, UserRecord.class);
    record = this.context.insertInto(USER).set(record).returning().fetchOne();
    return mapper.map(record, User.class);
  }

  @GetMapping
  public List<User> list() {
    return this.context
        .select()
        .from(USER)
        .fetchInto(USER)
        .stream()
        .map(this::mapper)
        .collect(Collectors.toList());
  }

  @DeleteMapping("/{id}")
  public User delete(@PathVariable Long id) {
    UserRecord record = this.context.deleteFrom(USER).where(USER.ID.eq(id)).returning().fetchOne();
    return this.mapper(record);
  }

  private User mapper(UserRecord record) {
    if (record == null) return null;
    return mapper.map(record, User.class);
  }
}
