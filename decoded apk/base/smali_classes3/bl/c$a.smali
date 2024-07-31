.class final synthetic Lbl/c$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbl/c;->y()Lvk/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lok/p<",
        "Ljava/lang/Long;",
        "Lbl/i<",
        "TE;>;",
        "Lbl/i<",
        "TE;>;>;"
    }
.end annotation


# static fields
.field public static final a:Lbl/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbl/c$a;

    invoke-direct {v0}, Lbl/c$a;-><init>()V

    sput-object v0, Lbl/c$a;->a:Lbl/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const/4 v1, 0x2

    const-class v2, Lbl/c;

    const-string v3, "createSegment"

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(JLbl/i;)Lbl/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lbl/i<",
            "TE;>;)",
            "Lbl/i<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lbl/c;->c(JLbl/i;)Lbl/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lbl/i;

    invoke-virtual {p0, v0, v1, p2}, Lbl/c$a;->a(JLbl/i;)Lbl/i;

    move-result-object p1

    return-object p1
.end method
