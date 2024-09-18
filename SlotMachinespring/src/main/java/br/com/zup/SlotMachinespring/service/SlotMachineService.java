package br.com.zup.SlotMachinespring.service;

import br.com.zup.SlotMachinespring.model.Symbol;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SlotMachineService {
    private static final Random RANDOM = new Random();

    // Retorna um símbolo aleatório
    public Symbol getSymbol() {
        Symbol[] symbols = Symbol.values();
        return symbols[RANDOM.nextInt(symbols.length)];
    }
}

