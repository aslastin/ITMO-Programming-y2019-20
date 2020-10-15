package expression.generic.binaryOp;

import expression.generic.Expression;
import expression.generic.parser.exceptions.ArithmeticExpressionException;
import expression.generic.parser.token.TokenType;
import expression.generic.types.Type;

public class Multiply<T extends Number> extends BinaryOperation<T> {
    public Multiply(Expression<T> firstArg, Expression<T> secondArg) {
        super(firstArg, secondArg, "*");
    }

    @Override
    public TokenType getTokenType() {
        return TokenType.MUL;
    }

    @Override
    protected Type<T> calc(Type<T> a, Type<T>  b) throws ArithmeticExpressionException {
        return a.multiply(b);
    }
}