.class final Lil/b$a$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil/b$a;->b(Lck/v;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/lang/Throwable;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lil/b;

.field final synthetic b:Lil/b$a;


# direct methods
.method constructor <init>(Lil/b;Lil/b$a;)V
    .locals 0

    iput-object p1, p0, Lil/b$a$b;->a:Lil/b;

    iput-object p2, p0, Lil/b$a$b;->b:Lil/b$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Lil/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    iget-object v0, p0, Lil/b$a$b;->a:Lil/b;

    iget-object v1, p0, Lil/b$a$b;->b:Lil/b$a;

    iget-object v1, v1, Lil/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lil/b$a$b;->a:Lil/b;

    iget-object v0, p0, Lil/b$a$b;->b:Lil/b$a;

    iget-object v0, v0, Lil/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lil/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lil/b$a$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
