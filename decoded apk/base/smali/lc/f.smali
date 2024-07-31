.class public final synthetic Llc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Llc/i;

.field public final synthetic b:Llc/b;


# direct methods
.method public synthetic constructor <init>(Llc/i;Llc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc/f;->a:Llc/i;

    iput-object p2, p0, Llc/f;->b:Llc/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llc/f;->a:Llc/i;

    iget-object v1, p0, Llc/f;->b:Llc/b;

    invoke-static {v0, v1}, Llc/i;->c(Llc/i;Llc/b;)Llc/c;

    move-result-object v0

    return-object v0
.end method
