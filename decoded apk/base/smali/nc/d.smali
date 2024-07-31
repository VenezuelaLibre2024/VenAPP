.class public final synthetic Lnc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lca/f;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lca/f;Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/d;->a:Lca/f;

    iput-object p2, p0, Lnc/d;->b:Landroid/content/Context;

    iput-object p3, p0, Lnc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnc/d;->a:Lca/f;

    iget-object v1, p0, Lnc/d;->b:Landroid/content/Context;

    iget-object v2, p0, Lnc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lnc/g;->d(Lca/f;Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
