package org.openapitools.configuration;

import model.DecyzjaRbi;
import model.EtapProcesu;
import model.InteractionStatusEnum;
import model.KnfOperationTypeEnum;
import model.NoteSectionEnum;
import model.RodzajUgody;
import model.RodzajUgodyKnf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.decyzjaRbiConverter")
    Converter<String, DecyzjaRbi> decyzjaRbiConverter() {
        return new Converter<String, DecyzjaRbi>() {
            @Override
            public DecyzjaRbi convert(String source) {
                return DecyzjaRbi.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.etapProcesuConverter")
    Converter<String, EtapProcesu> etapProcesuConverter() {
        return new Converter<String, EtapProcesu>() {
            @Override
            public EtapProcesu convert(String source) {
                return EtapProcesu.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.interactionStatusEnumConverter")
    Converter<String, InteractionStatusEnum> interactionStatusEnumConverter() {
        return new Converter<String, InteractionStatusEnum>() {
            @Override
            public InteractionStatusEnum convert(String source) {
                return InteractionStatusEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.knfOperationTypeEnumConverter")
    Converter<String, KnfOperationTypeEnum> knfOperationTypeEnumConverter() {
        return new Converter<String, KnfOperationTypeEnum>() {
            @Override
            public KnfOperationTypeEnum convert(String source) {
                return KnfOperationTypeEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.noteSectionEnumConverter")
    Converter<String, NoteSectionEnum> noteSectionEnumConverter() {
        return new Converter<String, NoteSectionEnum>() {
            @Override
            public NoteSectionEnum convert(String source) {
                return NoteSectionEnum.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.rodzajUgodyConverter")
    Converter<String, RodzajUgody> rodzajUgodyConverter() {
        return new Converter<String, RodzajUgody>() {
            @Override
            public RodzajUgody convert(String source) {
                return RodzajUgody.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.rodzajUgodyKnfConverter")
    Converter<String, RodzajUgodyKnf> rodzajUgodyKnfConverter() {
        return new Converter<String, RodzajUgodyKnf>() {
            @Override
            public RodzajUgodyKnf convert(String source) {
                return RodzajUgodyKnf.fromValue(source);
            }
        };
    }

}
