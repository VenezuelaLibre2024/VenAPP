.class public final Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv1/a$a;
    }
.end annotation


# static fields
.field public static final c:Lv1/a$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv1/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lv1/a;->c:Lv1/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lv1/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lv1/a;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lv1/k;)V
    .locals 2

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv1/a;->c:Lv1/a$a;

    iget-object v1, p0, Lv1/a;->b:[Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lv1/a$a;->b(Lv1/k;[Ljava/lang/Object;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv1/a;->a:Ljava/lang/String;

    return-object v0
.end method
