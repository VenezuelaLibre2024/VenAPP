.class public final enum Lnm/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnm/s;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnm/s;

.field public static final enum LOOP:Lnm/s;

.field public static final enum RELEASE:Lnm/s;

.field public static final enum STOP:Lnm/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnm/s;

    const-string v1, "RELEASE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnm/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnm/s;->RELEASE:Lnm/s;

    new-instance v0, Lnm/s;

    const-string v1, "LOOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnm/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnm/s;->LOOP:Lnm/s;

    new-instance v0, Lnm/s;

    const-string v1, "STOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnm/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnm/s;->STOP:Lnm/s;

    invoke-static {}, Lnm/s;->b()[Lnm/s;

    move-result-object v0

    sput-object v0, Lnm/s;->$VALUES:[Lnm/s;

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

.method private static final synthetic b()[Lnm/s;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lnm/s;

    const/4 v1, 0x0

    sget-object v2, Lnm/s;->RELEASE:Lnm/s;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lnm/s;->LOOP:Lnm/s;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lnm/s;->STOP:Lnm/s;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnm/s;
    .locals 1

    const-class v0, Lnm/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnm/s;

    return-object p0
.end method

.method public static values()[Lnm/s;
    .locals 1

    sget-object v0, Lnm/s;->$VALUES:[Lnm/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnm/s;

    return-object v0
.end method
