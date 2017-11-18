package com.ipg;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceWrapper;
import com.liferay.portal.service.UserLocalService;
public class MyUserLocalService extends UserLocalServiceWrapper {
    public MyUserLocalService(UserLocalService userLocalService) {
        super(userLocalService);
    }
    @Override
    public int getUsersCount() throws SystemException {
        System.out.println("This text is from getUsersCount ");
        return super.getUsersCount();
    }
}
