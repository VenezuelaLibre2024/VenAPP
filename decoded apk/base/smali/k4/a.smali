.class public final enum Lk4/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/a;

.field public static final enum CUSTOM:Lk4/a;

.field public static final Companion:Lk4/a$a;

.field public static final enum MOBILE_APP_INSTALL:Lk4/a;

.field public static final enum OTHER:Lk4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk4/a;

    const-string v1, "MOBILE_APP_INSTALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk4/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk4/a;->MOBILE_APP_INSTALL:Lk4/a;

    new-instance v0, Lk4/a;

    const-string v1, "CUSTOM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk4/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk4/a;->CUSTOM:Lk4/a;

    new-instance v0, Lk4/a;

    const-string v1, "OTHER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lk4/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk4/a;->OTHER:Lk4/a;

    invoke-static {}, Lk4/a;->b()[Lk4/a;

    move-result-object v0

    sput-object v0, Lk4/a;->$VALUES:[Lk4/a;

    new-instance v0, Lk4/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk4/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lk4/a;->Companion:Lk4/a$a;

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

.method private static final synthetic b()[Lk4/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lk4/a;

    const/4 v1, 0x0

    sget-object v2, Lk4/a;->MOBILE_APP_INSTALL:Lk4/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/a;->CUSTOM:Lk4/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/a;->OTHER:Lk4/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/a;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/a;

    return-object p0
.end method

.method public static values()[Lk4/a;
    .locals 2

    sget-object v0, Lk4/a;->$VALUES:[Lk4/a;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/a;

    return-object v0
.end method
