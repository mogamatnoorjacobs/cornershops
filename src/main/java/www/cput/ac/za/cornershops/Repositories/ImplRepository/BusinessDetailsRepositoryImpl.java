package www.cput.ac.za.cornershops.Repositories.ImplRepository;

import www.cput.ac.za.cornershops.Domain.BusinessDetails;
import www.cput.ac.za.cornershops.Repositories.BusinessDetailsRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class BusinessDetailsRepositoryImpl implements BusinessDetailsRepository {

    private static BusinessDetailsRepositoryImpl respository = null;

    private Map<String,BusinessDetails> businessDetailsTable;

    private BusinessDetailsRepositoryImpl() {
        businessDetailsTable = new HashMap<String, BusinessDetails>();
    }

    public static BusinessDetailsRepositoryImpl getInstance(){
        if(respository==null)
            respository = new BusinessDetailsRepositoryImpl();
        return respository;
    }

    public BusinessDetails create(BusinessDetails businessDetails) {
        businessDetailsTable.put(businessDetails.getBusinessId(),businessDetails);
        BusinessDetails savedBusinessDetails = businessDetailsTable.get(businessDetails.getBusinessId());
        return savedBusinessDetails;
    }

    public BusinessDetails read(String id) {
        BusinessDetails businessDetails = businessDetailsTable.get(id);
        return businessDetails;
    }

    public BusinessDetails update(BusinessDetails businessDetails) {
        businessDetailsTable.put(businessDetails.getBusinessId(),businessDetails);
        BusinessDetails savedBusinessDetails = businessDetailsTable.get(businessDetails.getBusinessId());
        return savedBusinessDetails;
    }

    public void delete(String id) {
        businessDetailsTable.remove(id);

    }
}
