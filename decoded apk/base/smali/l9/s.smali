.class public final synthetic Ll9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll9/a;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lm9/b;


# direct methods
.method public synthetic constructor <init>(Ll9/a;Landroid/os/Bundle;Lm9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/s;->a:Ll9/a;

    iput-object p2, p0, Ll9/s;->b:Landroid/os/Bundle;

    iput-object p3, p0, Ll9/s;->c:Lm9/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ll9/s;->a:Ll9/a;

    iget-object v1, p0, Ll9/s;->b:Landroid/os/Bundle;

    iget-object v2, p0, Ll9/s;->c:Lm9/b;

    invoke-virtual {v0, v1, v2}, Ll9/a;->b(Landroid/os/Bundle;Lm9/b;)V

    return-void
.end method
