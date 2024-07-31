.class public final synthetic La8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La8/p;


# direct methods
.method public synthetic constructor <init>(La8/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/o;->a:La8/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, La8/o;->a:La8/p;

    invoke-static {v0}, La8/p;->u(La8/p;)V

    return-void
.end method
