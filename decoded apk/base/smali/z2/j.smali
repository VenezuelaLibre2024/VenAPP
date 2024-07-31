.class public final synthetic Lz2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lz2/k;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ly2/a;


# direct methods
.method public synthetic constructor <init>(Lz2/k;Landroid/app/Activity;Ly2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/j;->a:Lz2/k;

    iput-object p2, p0, Lz2/j;->b:Landroid/app/Activity;

    iput-object p3, p0, Lz2/j;->c:Ly2/a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lz2/j;->a:Lz2/k;

    iget-object v1, p0, Lz2/j;->b:Landroid/app/Activity;

    iget-object v2, p0, Lz2/j;->c:Ly2/a;

    invoke-static {v0, v1, v2, p1}, Lz2/k;->h(Lz2/k;Landroid/app/Activity;Ly2/a;Ljava/lang/Exception;)V

    return-void
.end method
