.class public final enum Lof/c$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lof/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lof/c$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lof/c$c;

.field public static final enum EXPERIMENTAL_PAYLOAD:Lof/c$c;

.field public static final enum PAYLOAD_NOT_SET:Lof/c$c;

.field public static final enum VANILLA_PAYLOAD:Lof/c$c;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lof/c$c;

    const-string v1, "VANILLA_PAYLOAD"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lof/c$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lof/c$c;->VANILLA_PAYLOAD:Lof/c$c;

    new-instance v1, Lof/c$c;

    const-string v4, "EXPERIMENTAL_PAYLOAD"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lof/c$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lof/c$c;->EXPERIMENTAL_PAYLOAD:Lof/c$c;

    new-instance v4, Lof/c$c;

    const-string v6, "PAYLOAD_NOT_SET"

    invoke-direct {v4, v6, v5, v2}, Lof/c$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lof/c$c;->PAYLOAD_NOT_SET:Lof/c$c;

    const/4 v6, 0x3

    new-array v6, v6, [Lof/c$c;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    sput-object v6, Lof/c$c;->$VALUES:[Lof/c$c;

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

    iput p3, p0, Lof/c$c;->value:I

    return-void
.end method

.method public static b(I)Lof/c$c;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lof/c$c;->EXPERIMENTAL_PAYLOAD:Lof/c$c;

    return-object p0

    :cond_1
    sget-object p0, Lof/c$c;->VANILLA_PAYLOAD:Lof/c$c;

    return-object p0

    :cond_2
    sget-object p0, Lof/c$c;->PAYLOAD_NOT_SET:Lof/c$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lof/c$c;
    .locals 1

    const-class v0, Lof/c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lof/c$c;

    return-object p0
.end method

.method public static values()[Lof/c$c;
    .locals 1

    sget-object v0, Lof/c$c;->$VALUES:[Lof/c$c;

    invoke-virtual {v0}, [Lof/c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lof/c$c;

    return-object v0
.end method
