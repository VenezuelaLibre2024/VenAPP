.class public final synthetic Lqd/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lqd/q;


# direct methods
.method public synthetic constructor <init>(Lqd/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/p;->a:Lqd/q;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqd/p;->a:Lqd/q;

    check-cast p1, Lde/o;

    invoke-static {v0, p1}, Lqd/q;->a(Lqd/q;Lde/o;)V

    return-void
.end method
