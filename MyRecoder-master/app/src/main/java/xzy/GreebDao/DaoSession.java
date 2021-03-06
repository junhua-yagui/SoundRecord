package xzy.GreebDao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import xzy.myrecoder.Model.RecoderItem;

import xzy.GreebDao.RecoderItemDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig recoderItemDaoConfig;

    private final RecoderItemDao recoderItemDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        recoderItemDaoConfig = daoConfigMap.get(RecoderItemDao.class).clone();
        recoderItemDaoConfig.initIdentityScope(type);

        recoderItemDao = new RecoderItemDao(recoderItemDaoConfig, this);

        registerDao(RecoderItem.class, recoderItemDao);
    }
    
    public void clear() {
        recoderItemDaoConfig.clearIdentityScope();
    }

    public RecoderItemDao getRecoderItemDao() {
        return recoderItemDao;
    }

}
