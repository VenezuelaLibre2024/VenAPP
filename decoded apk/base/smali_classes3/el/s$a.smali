.class public abstract Lel/s$a;
.super Lel/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lel/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lel/b<",
        "Lel/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lel/s;

.field public c:Lel/s;


# direct methods
.method public constructor <init>(Lel/s;)V
    .locals 0

    invoke-direct {p0}, Lel/b;-><init>()V

    iput-object p1, p0, Lel/s$a;->b:Lel/s;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lel/s;

    invoke-virtual {p0, p1, p2}, Lel/s$a;->e(Lel/s;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lel/s;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lel/s$a;->b:Lel/s;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lel/s$a;->c:Lel/s;

    :goto_1
    if-eqz v0, :cond_2

    invoke-static {}, Lel/s;->f()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p1, p0, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lel/s$a;->b:Lel/s;

    iget-object p2, p0, Lel/s$a;->c:Lel/s;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lel/s;->d(Lel/s;Lel/s;)V

    :cond_2
    return-void
.end method
