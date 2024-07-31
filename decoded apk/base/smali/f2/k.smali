.class public final enum Lf2/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf2/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lf2/k;

.field public static final enum CONNECTED:Lf2/k;

.field public static final enum METERED:Lf2/k;

.field public static final enum NOT_REQUIRED:Lf2/k;

.field public static final enum NOT_ROAMING:Lf2/k;

.field public static final enum TEMPORARILY_UNMETERED:Lf2/k;

.field public static final enum UNMETERED:Lf2/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/k;

    const-string v1, "NOT_REQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/k;->NOT_REQUIRED:Lf2/k;

    new-instance v0, Lf2/k;

    const-string v1, "CONNECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf2/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/k;->CONNECTED:Lf2/k;

    new-instance v0, Lf2/k;

    const-string v1, "UNMETERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf2/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/k;->UNMETERED:Lf2/k;

    new-instance v0, Lf2/k;

    const-string v1, "NOT_ROAMING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf2/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/k;->NOT_ROAMING:Lf2/k;

    new-instance v0, Lf2/k;

    const-string v1, "METERED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf2/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/k;->METERED:Lf2/k;

    new-instance v0, Lf2/k;

    const-string v1, "TEMPORARILY_UNMETERED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lf2/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/k;->TEMPORARILY_UNMETERED:Lf2/k;

    invoke-static {}, Lf2/k;->b()[Lf2/k;

    move-result-object v0

    sput-object v0, Lf2/k;->$VALUES:[Lf2/k;

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

.method private static final synthetic b()[Lf2/k;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lf2/k;

    const/4 v1, 0x0

    sget-object v2, Lf2/k;->NOT_REQUIRED:Lf2/k;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lf2/k;->CONNECTED:Lf2/k;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lf2/k;->UNMETERED:Lf2/k;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lf2/k;->NOT_ROAMING:Lf2/k;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lf2/k;->METERED:Lf2/k;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lf2/k;->TEMPORARILY_UNMETERED:Lf2/k;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf2/k;
    .locals 1

    const-class v0, Lf2/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf2/k;

    return-object p0
.end method

.method public static values()[Lf2/k;
    .locals 1

    sget-object v0, Lf2/k;->$VALUES:[Lf2/k;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf2/k;

    return-object v0
.end method
