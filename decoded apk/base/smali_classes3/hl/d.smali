.class public final enum Lhl/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhl/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhl/d;

.field public static final enum ALREADY_SELECTED:Lhl/d;

.field public static final enum CANCELLED:Lhl/d;

.field public static final enum REREGISTER:Lhl/d;

.field public static final enum SUCCESSFUL:Lhl/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhl/d;

    const-string v1, "SUCCESSFUL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhl/d;->SUCCESSFUL:Lhl/d;

    new-instance v0, Lhl/d;

    const-string v1, "REREGISTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhl/d;->REREGISTER:Lhl/d;

    new-instance v0, Lhl/d;

    const-string v1, "CANCELLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhl/d;->CANCELLED:Lhl/d;

    new-instance v0, Lhl/d;

    const-string v1, "ALREADY_SELECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhl/d;->ALREADY_SELECTED:Lhl/d;

    invoke-static {}, Lhl/d;->b()[Lhl/d;

    move-result-object v0

    sput-object v0, Lhl/d;->$VALUES:[Lhl/d;

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

.method private static final synthetic b()[Lhl/d;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lhl/d;

    const/4 v1, 0x0

    sget-object v2, Lhl/d;->SUCCESSFUL:Lhl/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lhl/d;->REREGISTER:Lhl/d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lhl/d;->CANCELLED:Lhl/d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lhl/d;->ALREADY_SELECTED:Lhl/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhl/d;
    .locals 1

    const-class v0, Lhl/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhl/d;

    return-object p0
.end method

.method public static values()[Lhl/d;
    .locals 1

    sget-object v0, Lhl/d;->$VALUES:[Lhl/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhl/d;

    return-object v0
.end method
