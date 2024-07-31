.class public final enum Lsh/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsh/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lsh/f;

.field public static final enum Loop:Lsh/f;

.field public static final enum Pause:Lsh/f;

.field public static final enum Stop:Lsh/f;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsh/f;

    const-string v1, "Loop"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lsh/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lsh/f;->Loop:Lsh/f;

    new-instance v0, Lsh/f;

    const-string v1, "Pause"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lsh/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lsh/f;->Pause:Lsh/f;

    new-instance v0, Lsh/f;

    const-string v1, "Stop"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lsh/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lsh/f;->Stop:Lsh/f;

    invoke-static {}, Lsh/f;->b()[Lsh/f;

    move-result-object v0

    sput-object v0, Lsh/f;->$VALUES:[Lsh/f;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lsh/f;->$ENTRIES:Lik/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lsh/f;->value:I

    return-void
.end method

.method private static final synthetic b()[Lsh/f;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lsh/f;

    const/4 v1, 0x0

    sget-object v2, Lsh/f;->Loop:Lsh/f;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lsh/f;->Pause:Lsh/f;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lsh/f;->Stop:Lsh/f;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsh/f;
    .locals 1

    const-class v0, Lsh/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsh/f;

    return-object p0
.end method

.method public static values()[Lsh/f;
    .locals 1

    sget-object v0, Lsh/f;->$VALUES:[Lsh/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsh/f;

    return-object v0
.end method
