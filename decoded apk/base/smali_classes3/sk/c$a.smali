.class public final Lsk/c$a;
.super Lsk/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsk/c$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsk/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lsk/c$a;-><init>()V

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lsk/c$a$a;->a:Lsk/c$a$a;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 1

    invoke-static {}, Lsk/c;->a()Lsk/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsk/c;->b(I)I

    move-result p1

    return p1
.end method

.method public c()I
    .locals 1

    invoke-static {}, Lsk/c;->a()Lsk/c;

    move-result-object v0

    invoke-virtual {v0}, Lsk/c;->c()I

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 1

    invoke-static {}, Lsk/c;->a()Lsk/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsk/c;->d(I)I

    move-result p1

    return p1
.end method

.method public e(II)I
    .locals 1

    invoke-static {}, Lsk/c;->a()Lsk/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lsk/c;->e(II)I

    move-result p1

    return p1
.end method
