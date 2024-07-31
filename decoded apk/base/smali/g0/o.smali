.class public final synthetic Lg0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Lw/y;

.field public final synthetic c:Lg0/d0;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Lw/y;Lg0/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/o;->a:Lg0/u;

    iput-object p2, p0, Lg0/o;->b:Lw/y;

    iput-object p3, p0, Lg0/o;->c:Lg0/d0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lg0/o;->a:Lg0/u;

    iget-object v1, p0, Lg0/o;->b:Lw/y;

    iget-object v2, p0, Lg0/o;->c:Lg0/d0;

    invoke-static {v0, v1, v2, p1}, Lg0/u;->h(Lg0/u;Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
