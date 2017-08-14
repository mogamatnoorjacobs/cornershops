package www.cput.ac.za.cornershops.Repositories;

import www.cput.ac.za.cornershops.Domain.BusinessDetails;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface BusinessDetailsRepository {
    BusinessDetails create(BusinessDetails businessDetails);

    BusinessDetails read(String id);

    BusinessDetails update(BusinessDetails businessDetails);

    void delete(String id);
}
