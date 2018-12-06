/**
 * This class is generated by jOOQ
 */
package com.lowang.ormjooq.domain.tables.daos;


import com.lowang.ormjooq.domain.tables.User;
import com.lowang.ormjooq.domain.tables.records.UserRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, com.lowang.ormjooq.domain.tables.pojos.User, Long> {

	/**
	 * Create a new UserDao without any configuration
	 */
	public UserDao() {
		super(User.USER, com.lowang.ormjooq.domain.tables.pojos.User.class);
	}

	/**
	 * Create a new UserDao with an attached configuration
	 */
	public UserDao(Configuration configuration) {
		super(User.USER, com.lowang.ormjooq.domain.tables.pojos.User.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Long getId(com.lowang.ormjooq.domain.tables.pojos.User object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<com.lowang.ormjooq.domain.tables.pojos.User> fetchById(Long... values) {
		return fetch(User.USER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.lowang.ormjooq.domain.tables.pojos.User fetchOneById(Long value) {
		return fetchOne(User.USER.ID, value);
	}

	/**
	 * Fetch records that have <code>address IN (values)</code>
	 */
	public List<com.lowang.ormjooq.domain.tables.pojos.User> fetchByAddress(String... values) {
		return fetch(User.USER.ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>locked IN (values)</code>
	 */
	public List<com.lowang.ormjooq.domain.tables.pojos.User> fetchByLocked(Boolean... values) {
		return fetch(User.USER.LOCKED, values);
	}

	/**
	 * Fetch records that have <code>mobile IN (values)</code>
	 */
	public List<com.lowang.ormjooq.domain.tables.pojos.User> fetchByMobile(String... values) {
		return fetch(User.USER.MOBILE, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public List<com.lowang.ormjooq.domain.tables.pojos.User> fetchByName(String... values) {
		return fetch(User.USER.NAME, values);
	}
}