.class public final synthetic Lu8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:Lw6/e;


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;Lw6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/p;->a:Lu8/y$a;

    iput-object p2, p0, Lu8/p;->b:Lw6/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu8/p;->a:Lu8/y$a;

    iget-object v1, p0, Lu8/p;->b:Lw6/e;

    invoke-static {v0, v1}, Lu8/y$a;->d(Lu8/y$a;Lw6/e;)V

    return-void
.end method
