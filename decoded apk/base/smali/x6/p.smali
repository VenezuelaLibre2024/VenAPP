.class public final synthetic Lx6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx6/u$a;

.field public final synthetic b:Lx6/u;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lx6/u$a;Lx6/u;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/p;->a:Lx6/u$a;

    iput-object p2, p0, Lx6/p;->b:Lx6/u;

    iput-object p3, p0, Lx6/p;->c:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx6/p;->a:Lx6/u$a;

    iget-object v1, p0, Lx6/p;->b:Lx6/u;

    iget-object v2, p0, Lx6/p;->c:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lx6/u$a;->e(Lx6/u$a;Lx6/u;Ljava/lang/Exception;)V

    return-void
.end method
