package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.BusinessDetails;
import www.cput.ac.za.cornershops.Repositories.BusinessDetailsRepository;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.BusinessDetailsRepositoryImpl;
import www.cput.ac.za.cornershops.Services.BusinessDetailsService;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class BusinessDetailsServiceImpl implements BusinessDetailsService {

    BusinessDetailsRepository repository = BusinessDetailsRepositoryImpl.getInstance();
    public BusinessDetails create(BusinessDetails businessDetails) {
        return repository.create(businessDetails);
    }

    public BusinessDetails read(String id) {
        return repository.read(id);
    }

    public BusinessDetails update(BusinessDetails businessDetails) {
        return repository.update(businessDetails);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
