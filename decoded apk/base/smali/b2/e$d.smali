.class Lb2/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/os/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/e;->w(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Landroidx/core/os/c;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb2/l;

.field final synthetic b:Lb2/e;


# direct methods
.method constructor <init>(Lb2/e;Lb2/l;)V
    .locals 0

    iput-object p1, p0, Lb2/e$d;->b:Lb2/e;

    iput-object p2, p0, Lb2/e$d;->a:Lb2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    iget-object v0, p0, Lb2/e$d;->a:Lb2/l;

    invoke-virtual {v0}, Lb2/l;->cancel()V

    return-void
.end method
