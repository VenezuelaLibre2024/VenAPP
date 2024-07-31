.class public final synthetic Lia/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/r;


# instance fields
.field public final synthetic a:Lia/v;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lha/a;

.field public final synthetic d:Lia/a;

.field public final synthetic e:Lia/d;


# direct methods
.method public synthetic constructor <init>(Lia/v;Ljava/util/concurrent/atomic/AtomicReference;Lha/a;Lia/a;Lia/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia/l;->a:Lia/v;

    iput-object p2, p0, Lia/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lia/l;->c:Lha/a;

    iput-object p4, p0, Lia/l;->d:Lia/a;

    iput-object p5, p0, Lia/l;->e:Lia/d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lia/l;->a:Lia/v;

    iget-object v1, p0, Lia/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lia/l;->c:Lha/a;

    iget-object v3, p0, Lia/l;->d:Lia/a;

    iget-object v4, p0, Lia/l;->e:Lia/d;

    check-cast p1, Lia/w;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v5, Lia/t;

    invoke-direct {v5, v0, v1, p2, v2}, Lia/t;-><init>(Lia/v;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/tasks/TaskCompletionSource;Lha/a;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lia/i;

    invoke-virtual {p1, v5, v3, v4}, Lia/i;->g2(Lia/h;Lia/a;Lia/k;)V

    return-void
.end method
