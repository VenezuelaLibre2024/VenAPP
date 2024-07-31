.class public final enum Lpj/o;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpj/o;",
        ">;",
        "Ljj/d<",
        "Lim/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lpj/o;

.field public static final enum INSTANCE:Lpj/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpj/o;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpj/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpj/o;->INSTANCE:Lpj/o;

    const/4 v1, 0x1

    new-array v1, v1, [Lpj/o;

    aput-object v0, v1, v2

    sput-object v1, Lpj/o;->$VALUES:[Lpj/o;

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

.method public static valueOf(Ljava/lang/String;)Lpj/o;
    .locals 1

    const-class v0, Lpj/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpj/o;

    return-object p0
.end method

.method public static values()[Lpj/o;
    .locals 1

    sget-object v0, Lpj/o;->$VALUES:[Lpj/o;

    invoke-virtual {v0}, [Lpj/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpj/o;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lim/c;

    invoke-virtual {p0, p1}, Lpj/o;->b(Lim/c;)V

    return-void
.end method

.method public b(Lim/c;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    return-void
.end method
