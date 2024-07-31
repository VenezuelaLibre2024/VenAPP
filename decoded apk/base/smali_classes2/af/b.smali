.class public final synthetic Laf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Laf/e;

.field public final synthetic b:Lcom/google/android/gms/tasks/Task;

.field public final synthetic c:Lcf/f;


# direct methods
.method public synthetic constructor <init>(Laf/e;Lcom/google/android/gms/tasks/Task;Lcf/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/b;->a:Laf/e;

    iput-object p2, p0, Laf/b;->b:Lcom/google/android/gms/tasks/Task;

    iput-object p3, p0, Laf/b;->c:Lcf/f;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Laf/b;->a:Laf/e;

    iget-object v1, p0, Laf/b;->b:Lcom/google/android/gms/tasks/Task;

    iget-object v2, p0, Laf/b;->c:Lcf/f;

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/g;

    invoke-static {v0, v1, v2, p1}, Laf/e;->c(Laf/e;Lcom/google/android/gms/tasks/Task;Lcf/f;Lcom/google/firebase/remoteconfig/internal/g;)V

    return-void
.end method
