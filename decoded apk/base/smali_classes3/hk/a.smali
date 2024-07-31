.class public final enum Lhk/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhk/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lhk/a;

.field public static final enum COROUTINE_SUSPENDED:Lhk/a;

.field public static final enum RESUMED:Lhk/a;

.field public static final enum UNDECIDED:Lhk/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhk/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhk/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhk/a;->COROUTINE_SUSPENDED:Lhk/a;

    new-instance v0, Lhk/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhk/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhk/a;->UNDECIDED:Lhk/a;

    new-instance v0, Lhk/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhk/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhk/a;->RESUMED:Lhk/a;

    invoke-static {}, Lhk/a;->b()[Lhk/a;

    move-result-object v0

    sput-object v0, Lhk/a;->$VALUES:[Lhk/a;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lhk/a;->$ENTRIES:Lik/a;

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

.method private static final synthetic b()[Lhk/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lhk/a;

    const/4 v1, 0x0

    sget-object v2, Lhk/a;->COROUTINE_SUSPENDED:Lhk/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lhk/a;->UNDECIDED:Lhk/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lhk/a;->RESUMED:Lhk/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhk/a;
    .locals 1

    const-class v0, Lhk/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhk/a;

    return-object p0
.end method

.method public static values()[Lhk/a;
    .locals 1

    sget-object v0, Lhk/a;->$VALUES:[Lhk/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhk/a;

    return-object v0
.end method
