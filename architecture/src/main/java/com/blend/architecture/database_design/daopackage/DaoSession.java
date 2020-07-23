package com.blend.architecture.database_design.daopackage;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.blend.architecture.database_design.daopackage.User;
import com.blend.architecture.database_design.daopackage.Friend;

import com.blend.architecture.database_design.daopackage.UserDao;
import com.blend.architecture.database_design.daopackage.FriendDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig friendDaoConfig;

    private final UserDao userDao;
    private final FriendDao friendDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        friendDaoConfig = daoConfigMap.get(FriendDao.class).clone();
        friendDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        friendDao = new FriendDao(friendDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(Friend.class, friendDao);
    }
    
    public void clear() {
        userDaoConfig.clearIdentityScope();
        friendDaoConfig.clearIdentityScope();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public FriendDao getFriendDao() {
        return friendDao;
    }

}
