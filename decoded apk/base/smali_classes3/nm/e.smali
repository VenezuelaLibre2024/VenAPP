.class public final synthetic Lnm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lom/o;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lom/o;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/e;->a:Lom/o;

    iput-boolean p2, p0, Lnm/e;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnm/e;->a:Lom/o;

    iget-boolean v1, p0, Lnm/e;->b:Z

    invoke-static {v0, v1}, Lnm/m;->e(Lom/o;Z)V

    return-void
.end method
