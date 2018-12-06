/**
 * This class is generated by jOOQ
 */
package com.lowang.ormjooq.domain;


import com.lowang.ormjooq.domain.tables.User;
import com.lowang.ormjooq.domain.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>lowang</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<UserRecord, Long> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, User.USER.ID);
	}
}