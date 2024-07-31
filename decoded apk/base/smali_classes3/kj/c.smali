.class public final enum Lkj/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lmj/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkj/c;",
        ">;",
        "Lmj/e<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lkj/c;

.field public static final enum INSTANCE:Lkj/c;

.field public static final enum NEVER:Lkj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkj/c;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkj/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj/c;->INSTANCE:Lkj/c;

    new-instance v1, Lkj/c;

    const-string v3, "NEVER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lkj/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkj/c;->NEVER:Lkj/c;

    const/4 v3, 0x2

    new-array v3, v3, [Lkj/c;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lkj/c;->$VALUES:[Lkj/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static b(Ldj/c;)V
    .locals 1

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p0, v0}, Ldj/c;->b(Lgj/b;)V

    invoke-interface {p0}, Ldj/c;->a()V

    return-void
.end method

.method public static i(Ldj/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p0, v0}, Ldj/l;->b(Lgj/b;)V

    invoke-interface {p0}, Ldj/l;->a()V

    return-void
.end method

.method public static m(Ldj/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p0, v0}, Ldj/q;->b(Lgj/b;)V

    invoke-interface {p0}, Ldj/q;->a()V

    return-void
.end method

.method public static n(Ljava/lang/Throwable;Ldj/c;)V
    .locals 1

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p1, v0}, Ldj/c;->b(Lgj/b;)V

    invoke-interface {p1, p0}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static o(Ljava/lang/Throwable;Ldj/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ldj/l<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p1, v0}, Ldj/l;->b(Lgj/b;)V

    invoke-interface {p1, p0}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static p(Ljava/lang/Throwable;Ldj/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ldj/q<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p1, v0}, Ldj/q;->b(Lgj/b;)V

    invoke-interface {p1, p0}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static q(Ljava/lang/Throwable;Ldj/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ldj/t<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    invoke-interface {p1, v0}, Ldj/t;->b(Lgj/b;)V

    invoke-interface {p1, p0}, Ldj/t;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkj/c;
    .locals 1

    const-class v0, Lkj/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkj/c;

    return-object p0
.end method

.method public static values()[Lkj/c;
    .locals 1

    sget-object v0, Lkj/c;->$VALUES:[Lkj/c;

    invoke-virtual {v0}, [Lkj/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkj/c;

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public h()Z
    .locals 1

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l(I)I
    .locals 0

    and-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public poll()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
