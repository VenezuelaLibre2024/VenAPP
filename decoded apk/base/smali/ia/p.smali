.class public final synthetic Lia/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/r;


# instance fields
.field public final synthetic a:Lia/v;

.field public final synthetic b:Lia/a;


# direct methods
.method public synthetic constructor <init>(Lia/v;Lia/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia/p;->a:Lia/v;

    iput-object p2, p0, Lia/p;->b:Lia/a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lia/p;->a:Lia/v;

    iget-object v1, p0, Lia/p;->b:Lia/a;

    check-cast p1, Lia/w;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, Lia/r;

    invoke-direct {v2, v0, p2}, Lia/r;-><init>(Lia/v;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lia/i;

    invoke-virtual {p1, v2, v1}, Lia/i;->f2(Lia/h;Lia/a;)V

    return-void
.end method
