.class public final enum Lf2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf2/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lf2/a;

.field public static final enum EXPONENTIAL:Lf2/a;

.field public static final enum LINEAR:Lf2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/a;

    const-string v1, "EXPONENTIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/a;->EXPONENTIAL:Lf2/a;

    new-instance v0, Lf2/a;

    const-string v1, "LINEAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/a;->LINEAR:Lf2/a;

    invoke-static {}, Lf2/a;->b()[Lf2/a;

    move-result-object v0

    sput-object v0, Lf2/a;->$VALUES:[Lf2/a;

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

.method private static final synthetic b()[Lf2/a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lf2/a;

    const/4 v1, 0x0

    sget-object v2, Lf2/a;->EXPONENTIAL:Lf2/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lf2/a;->LINEAR:Lf2/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf2/a;
    .locals 1

    const-class v0, Lf2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf2/a;

    return-object p0
.end method

.method public static values()[Lf2/a;
    .locals 1

    sget-object v0, Lf2/a;->$VALUES:[Lf2/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf2/a;

    return-object v0
.end method
