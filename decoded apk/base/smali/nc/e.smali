.class public final synthetic Lnc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lnc/g;

.field public final synthetic b:Lnc/a;


# direct methods
.method public synthetic constructor <init>(Lnc/g;Lnc/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/e;->a:Lnc/g;

    iput-object p2, p0, Lnc/e;->b:Lnc/a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lnc/e;->a:Lnc/g;

    iget-object v1, p0, Lnc/e;->b:Lnc/a;

    invoke-static {v0, v1}, Lnc/g;->c(Lnc/g;Lnc/a;)Lhc/a;

    move-result-object v0

    return-object v0
.end method
