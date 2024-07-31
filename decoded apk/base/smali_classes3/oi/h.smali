.class public final synthetic Loi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/h;->a:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Loi/h;->a:Landroidx/camera/core/o;

    invoke-static {v0, p1}, Loi/s;->b(Landroidx/camera/core/o;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
