.class public final Lr1/o$e;
.super Lr1/o$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final b:Lr1/o;

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lr1/o$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr1/o;Lr1/o$c;)V
    .locals 1

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lr1/o$c;->a()[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lr1/o$c;-><init>([Ljava/lang/String;)V

    iput-object p1, p0, Lr1/o$e;->b:Lr1/o;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lr1/o$e;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public c(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr1/o$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/o$c;

    if-nez v0, :cond_0

    iget-object p1, p0, Lr1/o$e;->b:Lr1/o;

    invoke-virtual {p1, p0}, Lr1/o;->o(Lr1/o$c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lr1/o$c;->c(Ljava/util/Set;)V

    :goto_0
    return-void
.end method
