package user.management.userManagement.core.utilities.mappers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModelMapperManager implements ModelMapperService{
    private ModelMapper modelMapper;

    //Burada gevsek mapleme yapilir. veritabaninda 5 alan var ama responsta 3 tane varsa kizma devam et.
    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true) //belirsizlikleri ignore et
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return this.modelMapper;
    }

    //Burada herseyin bir karsiligi olmali. eger 5 veri varsa 5 karsiligi olmali.
    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);
        return this.modelMapper;
    }
}
