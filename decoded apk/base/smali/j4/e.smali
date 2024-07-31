.class public final synthetic Lj4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lj4/f;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lj4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/e;->a:Landroid/view/View;

    iput-object p2, p0, Lj4/e;->b:Lj4/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj4/e;->a:Landroid/view/View;

    iget-object v1, p0, Lj4/e;->b:Lj4/f;

    invoke-static {v0, v1}, Lj4/f;->a(Landroid/view/View;Lj4/f;)V

    return-void
.end method
