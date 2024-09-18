package br.com.zup.SlotMachinespring.controller;

import br.com.zup.SlotMachinespring.controller.dtos.SortitionDTO;
import br.com.zup.SlotMachinespring.model.Symbol;
import br.com.zup.SlotMachinespring.service.SlotMachineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slot")
public class SlotController {

    private final SlotMachineService slotMachineService;

    public SlotController(SlotMachineService slotMachineService) {
        this.slotMachineService = slotMachineService;
    }

    @GetMapping("/sortittion")
    public SortitionDTO sortittion() {
        // Sorteia três símbolos aleatórios
        Symbol firstSymbol = slotMachineService.getSymbol();
        Symbol secondSymbol = slotMachineService.getSymbol();
        Symbol thirdSymbol = slotMachineService.getSymbol();


        // Calcula os pontos somando os valores dos três símbolos
        int totalPoints = firstSymbol.getPoints() + secondSymbol.getPoints() + thirdSymbol.getPoints();

        // Se todos os símbolos forem iguais, aplica o bônus de 100 pontos
        if (firstSymbol == secondSymbol && secondSymbol == thirdSymbol) {
            totalPoints += 100; // Bônus
        }

        // Retorna o DTO com os símbolos em lowercase e os pontos totais
        return new SortitionDTO(
                firstSymbol.getLowerCaseName(),
                secondSymbol.getLowerCaseName(),
                thirdSymbol.getLowerCaseName(),
                totalPoints
        );
    }
}
