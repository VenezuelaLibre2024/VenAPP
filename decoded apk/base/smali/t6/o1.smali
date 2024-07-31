.class public final synthetic Lt6/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/v;


# instance fields
.field public final synthetic a:Lt6/q1;


# direct methods
.method public synthetic constructor <init>(Lt6/q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/o1;->a:Lt6/q1;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt6/o1;->a:Lt6/q1;

    invoke-static {v0}, Lt6/q1;->e(Lt6/q1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
