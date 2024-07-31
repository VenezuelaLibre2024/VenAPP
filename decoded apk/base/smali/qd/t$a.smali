.class public final enum Lqd/t$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/t$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/t$a;

.field public static final enum AUTO:Lqd/t$a;

.field public static final enum CLICK:Lqd/t$a;

.field public static final enum SWIPE:Lqd/t$a;

.field public static final enum UNKNOWN_DISMISS_TYPE:Lqd/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lqd/t$a;

    const-string v1, "UNKNOWN_DISMISS_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqd/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/t$a;->UNKNOWN_DISMISS_TYPE:Lqd/t$a;

    new-instance v1, Lqd/t$a;

    const-string v3, "AUTO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqd/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqd/t$a;->AUTO:Lqd/t$a;

    new-instance v3, Lqd/t$a;

    const-string v5, "CLICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqd/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqd/t$a;->CLICK:Lqd/t$a;

    new-instance v5, Lqd/t$a;

    const-string v7, "SWIPE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lqd/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lqd/t$a;->SWIPE:Lqd/t$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lqd/t$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lqd/t$a;->$VALUES:[Lqd/t$a;

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

.method public static valueOf(Ljava/lang/String;)Lqd/t$a;
    .locals 1

    const-class v0, Lqd/t$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/t$a;

    return-object p0
.end method

.method public static values()[Lqd/t$a;
    .locals 1

    sget-object v0, Lqd/t$a;->$VALUES:[Lqd/t$a;

    invoke-virtual {v0}, [Lqd/t$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/t$a;

    return-object v0
.end method
