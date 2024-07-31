.class public final synthetic Lg0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lg0/u;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/r;->a:Lg0/u;

    iput p2, p0, Lg0/r;->b:I

    iput p3, p0, Lg0/r;->c:I

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lg0/r;->a:Lg0/u;

    iget v1, p0, Lg0/r;->b:I

    iget v2, p0, Lg0/r;->c:I

    invoke-static {v0, v1, v2, p1}, Lg0/u;->e(Lg0/u;IILandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
