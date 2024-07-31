.class public final synthetic Lx6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx6/h$f;


# direct methods
.method public synthetic constructor <init>(Lx6/h$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/i;->a:Lx6/h$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx6/i;->a:Lx6/h$f;

    invoke-static {v0}, Lx6/h$f;->c(Lx6/h$f;)V

    return-void
.end method
