.class public final Lt6/j3$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/j3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lt8/l;


# direct methods
.method public constructor <init>(Lt8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/j3$c;->a:Lt8/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lt6/j3$c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lt6/j3$c;

    iget-object v0, p0, Lt6/j3$c;->a:Lt8/l;

    iget-object p1, p1, Lt6/j3$c;->a:Lt8/l;

    invoke-virtual {v0, p1}, Lt8/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lt6/j3$c;->a:Lt8/l;

    invoke-virtual {v0}, Lt8/l;->hashCode()I

    move-result v0

    return v0
.end method
