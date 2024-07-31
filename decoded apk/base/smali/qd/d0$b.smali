.class public final enum Lqd/d0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/d0$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/d0$b;

.field public static final enum BANNER:Lqd/d0$b;

.field public static final enum CARD:Lqd/d0$b;

.field public static final enum IMAGE_ONLY:Lqd/d0$b;

.field public static final enum MESSAGEDETAILS_NOT_SET:Lqd/d0$b;

.field public static final enum MODAL:Lqd/d0$b;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lqd/d0$b;

    const-string v1, "BANNER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lqd/d0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqd/d0$b;->BANNER:Lqd/d0$b;

    new-instance v1, Lqd/d0$b;

    const-string v4, "MODAL"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lqd/d0$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqd/d0$b;->MODAL:Lqd/d0$b;

    new-instance v4, Lqd/d0$b;

    const-string v6, "IMAGE_ONLY"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lqd/d0$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lqd/d0$b;->IMAGE_ONLY:Lqd/d0$b;

    new-instance v6, Lqd/d0$b;

    const-string v8, "CARD"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lqd/d0$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lqd/d0$b;->CARD:Lqd/d0$b;

    new-instance v8, Lqd/d0$b;

    const-string v10, "MESSAGEDETAILS_NOT_SET"

    invoke-direct {v8, v10, v9, v2}, Lqd/d0$b;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lqd/d0$b;->MESSAGEDETAILS_NOT_SET:Lqd/d0$b;

    const/4 v10, 0x5

    new-array v10, v10, [Lqd/d0$b;

    aput-object v0, v10, v2

    aput-object v1, v10, v3

    aput-object v4, v10, v5

    aput-object v6, v10, v7

    aput-object v8, v10, v9

    sput-object v10, Lqd/d0$b;->$VALUES:[Lqd/d0$b;

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

    iput p3, p0, Lqd/d0$b;->value:I

    return-void
.end method

.method public static b(I)Lqd/d0$b;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lqd/d0$b;->CARD:Lqd/d0$b;

    return-object p0

    :cond_1
    sget-object p0, Lqd/d0$b;->IMAGE_ONLY:Lqd/d0$b;

    return-object p0

    :cond_2
    sget-object p0, Lqd/d0$b;->MODAL:Lqd/d0$b;

    return-object p0

    :cond_3
    sget-object p0, Lqd/d0$b;->BANNER:Lqd/d0$b;

    return-object p0

    :cond_4
    sget-object p0, Lqd/d0$b;->MESSAGEDETAILS_NOT_SET:Lqd/d0$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/d0$b;
    .locals 1

    const-class v0, Lqd/d0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/d0$b;

    return-object p0
.end method

.method public static values()[Lqd/d0$b;
    .locals 1

    sget-object v0, Lqd/d0$b;->$VALUES:[Lqd/d0$b;

    invoke-virtual {v0}, [Lqd/d0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/d0$b;

    return-object v0
.end method
