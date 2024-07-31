.class public interface abstract Lql/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/b$a;
    }
.end annotation


# static fields
.field public static final a:Lql/b$a;

.field public static final b:Lql/b;

.field public static final c:Lql/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lql/b$a;->a:Lql/b$a;

    sput-object v0, Lql/b;->a:Lql/b$a;

    new-instance v0, Lql/b$a$a;

    invoke-direct {v0}, Lql/b$a$a;-><init>()V

    sput-object v0, Lql/b;->b:Lql/b;

    new-instance v0, Lsl/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lsl/a;-><init>(Lql/q;ILkotlin/jvm/internal/g;)V

    sput-object v0, Lql/b;->c:Lql/b;

    return-void
.end method


# virtual methods
.method public abstract a(Lql/e0;Lql/c0;)Lql/a0;
.end method
