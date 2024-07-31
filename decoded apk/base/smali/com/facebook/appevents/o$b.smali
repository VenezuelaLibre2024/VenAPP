.class public final enum Lcom/facebook/appevents/o$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/appevents/o$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/appevents/o$b;

.field public static final enum AUTO:Lcom/facebook/appevents/o$b;

.field public static final enum EXPLICIT_ONLY:Lcom/facebook/appevents/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/appevents/o$b;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/appevents/o$b;->AUTO:Lcom/facebook/appevents/o$b;

    new-instance v0, Lcom/facebook/appevents/o$b;

    const-string v1, "EXPLICIT_ONLY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/appevents/o$b;->EXPLICIT_ONLY:Lcom/facebook/appevents/o$b;

    invoke-static {}, Lcom/facebook/appevents/o$b;->b()[Lcom/facebook/appevents/o$b;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/o$b;->$VALUES:[Lcom/facebook/appevents/o$b;

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

.method private static final synthetic b()[Lcom/facebook/appevents/o$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/appevents/o$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/appevents/o$b;->AUTO:Lcom/facebook/appevents/o$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/appevents/o$b;->EXPLICIT_ONLY:Lcom/facebook/appevents/o$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/appevents/o$b;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/appevents/o$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/appevents/o$b;

    return-object p0
.end method

.method public static values()[Lcom/facebook/appevents/o$b;
    .locals 2

    sget-object v0, Lcom/facebook/appevents/o$b;->$VALUES:[Lcom/facebook/appevents/o$b;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/appevents/o$b;

    return-object v0
.end method
