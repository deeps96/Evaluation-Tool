package de.hpi.evaluationtool.persistence;

import de.hpi.evaluationtool.service.SelectorMap;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@RequiredArgsConstructor
@ToString
public class ShopRules {

    private final SelectorMap selectorMap;

    @Id
    private final long shopID;
}