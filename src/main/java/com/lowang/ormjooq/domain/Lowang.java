/**
 * This class is generated by jOOQ
 */
package com.lowang.ormjooq.domain;


import com.lowang.ormjooq.domain.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Lowang extends SchemaImpl {

	private static final long serialVersionUID = 1269200844;

	/**
	 * The reference instance of <code>lowang</code>
	 */
	public static final Lowang LOWANG = new Lowang();

	/**
	 * No further instances allowed
	 */
	private Lowang() {
		super("lowang");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			User.USER);
	}
}